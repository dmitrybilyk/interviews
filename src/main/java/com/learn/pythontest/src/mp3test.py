# -*- coding: utf-8 -*-
__author__ = 'bid'


"""Получение метаинформации, специфичной для файла данного типа.

Создайте экземпляр соответствующего класса, передав конструктору имя файла.
Возвращаемый объект ведет себя аналогично словарю с парами ключ-значение для
каждой части метаинформации.
    import fileinfo
    info = fileinfo.MP3FileInfo("/music/ap/mahadeva.mp3")
    print "\\n".join(["%s=%s" % (k, v) for k, v in info.items()])

Или используйте функцию listDirectory для получения информации обо всех файлов
в директории
    for info in fileinfo.listDirectory("/music/ap/", [".mp3"]):
        ...

Модуль может быть расширен путем доюавления классов для других типов файлов,
например HTMLFileInfo, MPGFileInfo, DOCFileInfo.  Каждый класс полностью
отвечает за анализ файлов соответствующего типа; используйте MP3FileInfo в
качестве примера.
"""
import os
import sys
from UserDict import UserDict

def stripnulls(data):
    "очищает строку от символов пропуска и нулевых символов"
    return data.replace("\00", "").strip()

class FileInfo(UserDict):
    "хранит метаинформацию о файле"
    def __init__(self, filename=None):
        UserDict.__init__(self)
        self["name"] = filename

class MP3FileInfo(FileInfo):
    "хранит ID3v1.0 MP3 теги"
    tagDataMap = {"title"   : (  3,  33, stripnulls),
                  "artist"  : ( 33,  63, stripnulls),
                  "album"   : ( 63,  93, stripnulls),
                  "year"    : ( 93,  97, stripnulls),
                  "comment" : ( 97, 126, stripnulls),
                  "genre"   : (127, 128, ord)}

    def __parse(self, filename):
        "анализ ID3v1.0 тегов из MP3 файла"
        self.clear()
        try:
            fsock = open(filename, "rb", 0)
            try:
                fsock.seek(-128, 2)
                tagdata = fsock.read(128)
            finally:
                fsock.close()
            if tagdata[:3] == "TAG":
                for tag, (start, end, parseFunc) in self.tagDataMap.items():
                    self[tag] = parseFunc(tagdata[start:end])
        except IOError:
            pass

    def __setitem__(self, key, item):
        if key == "name" and item:
            self.__parse(item)
        FileInfo.__setitem__(self, key, item)

def listDirectory(directory, fileExtList):
    """возвращает список объектов с метаинформацией для всех файлов с
указанным расширением"""
    fileList = [os.path.normcase(f) for f in os.listdir(directory)]
    fileList = [os.path.join(directory, f) for f in fileList \
                if os.path.splitext(f)[1] in fileExtList]
    def getFileInfoClass(filename, module=sys.modules[FileInfo.__module__]):
        "оределяет класс, предназначеный для обработки файла, по расширению"
        subclass = "%sFileInfo" % os.path.splitext(filename)[1].upper()[1:]
        return hasattr(module, subclass) and getattr(module, subclass) or FileInfo
    return [getFileInfoClass(f)(f) for f in fileList]

if __name__ == "__main__":
    for info in listDirectory("/home/bid/Music/mp3/", [".mp3"]): 1
    print "\n".join(["%s=%s" % (k, v) for k, v in info.items()])
    print
