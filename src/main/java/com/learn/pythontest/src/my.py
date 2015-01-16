__author__ = 'bid'
# -*- coding: utf-8 -*-
def buildConnectionString(params):
    """Создает и возвращает строку соединения из словаря параметров."""
    return ";".join(["%s=%s" % (k, v) for k, v in params.items()])

if __name__ == "__main__":
    myParams = {"server":"mpilgrim", \
                "database":"master", \
                "uid":"sa", \
                "pwd":"secret"}
    print buildConnectionString(myParams)