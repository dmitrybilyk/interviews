package com.learn.other.ffmpeg;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Radek Mensik, 6.2.13
 */
public class SoxAudioProcessor implements AudioProcessor {

  private static Logger logger = LoggerFactory.getLogger(SoxAudioProcessor.class);
  public static final String SOX_PROCESS = "sox";
  public static final String LONG_BEEP_PATH = "/opt/callrec/common/media/long_beep.mp3";


  private String path_to_sox = "";
  public static final String COMPRESSION_PARAMETER = "-C";
  public static final String COMPRESSION_24KBPS = "24";
  public static final String CHANNELS_PARAMETER = "-c";
  public static final String TWO_CHANNELS = "2";
  public static final String FREQUENCY_PARAMETER = "-r";
  public static final String FREQUENCY_16k = "16k";
  public static final String FILE_TYPE_PARAMETER = "-t";
  public static final String FILE_TYPE_MP3 = "mp3";
  public static final String FILE_TYPE_MP4 = "mp4";

  public static final String TMP_FILE_PREFIX = "joined";
  public static final String TMP_FILE_SUFFIX = ".mp3";
  public static final String TMP_VIDEO_FILE_SUFFIX = ".mp4";


  public SoxAudioProcessor() {
  }

  public SoxAudioProcessor(String path_to_sox) {
    this.path_to_sox = path_to_sox;
  }

  /**
   * Converts source files to same default quality 16khz and 24kbps and then they are joined in order as they were added to sourceFiles input list.
   *
   * @param sourceFiles path to files which should be processed
   * @return Path to existing joined file.
   * @throws RequestFailedException
   */
  public String convertAndMix(List<String> sourceFiles) throws RequestFailedException {
    if (sourceFiles == null || sourceFiles.isEmpty()) {
      throw new IllegalArgumentException("List of files must contain at least one file");
    }
    String tmpPath = FileUtils.getTempDirectory().getAbsolutePath();
    List<String> normalizedFilePaths = normalizeFiles(sourceFiles, tmpPath);

    String resultFile = null;
    if (normalizedFilePaths.size() > 1) {
      resultFile = joinNormalizedFiles(normalizedFilePaths);
      for (String normalizedFile : normalizedFilePaths) {
        new File(normalizedFile).delete();
      }
    } else if (normalizedFilePaths.size() > 0) {
      resultFile = normalizedFilePaths.get(0);
    }

    if (resultFile == null) {
      throw new RequestFailedException("No file was successfully normalized.");
    }
    return resultFile;
  }

  private List<String> normalizeFiles(List<String> sourceFiles, String tmpPath) throws RequestFailedException {
    List<String> normalizedFiles = new ArrayList<String>();
    String beep_mp3 = LONG_BEEP_PATH;
    if (!new File(beep_mp3).exists()) {
      beep_mp3 = null;
    }

    for (String source : sourceFiles) {
      String name = new File(source).getName();
      String extension = FilenameUtils.getExtension(name);
      if (StringUtils.isNotBlank(extension)) {
        name = name.replace(extension, FILE_TYPE_MP4);
      }
      String tmpFile = tmpPath + File.separator + name;
      List<String> params = prepareSoxParamsForNormalize(source, tmpFile);

      ProcessBuilder processBuilder = new ProcessBuilder(params);

      try {
        executeProcess(processBuilder);
      } catch (IOException e) {
        throw new RequestFailedException("Executing of normalization of audio by sox failed", e);
      } catch (InterruptedException e) {
        throw new RequestFailedException("Executing of normalization of audio by sox failed", e);
      }
      if (logger.isDebugEnabled()) {
        logger.debug("Normalization of " + source + " ended.");
        logger.debug("Saved under name " + tmpFile);
      }


      if (!normalizedFiles.isEmpty() && beep_mp3 != null) {
        normalizedFiles.add(beep_mp3);
      }
      normalizedFiles.add(tmpFile);
    }
    return normalizedFiles;
  }

  private List<String> prepareSoxParamsForNormalize(String source, String tmpFile) {
    List<String> params = new ArrayList<String>();
    params.add(path_to_sox + SOX_PROCESS);
    params.add(source);
    params.add(COMPRESSION_PARAMETER);
    params.add(COMPRESSION_24KBPS);
    params.add(CHANNELS_PARAMETER);
    params.add(TWO_CHANNELS);
    params.add(FREQUENCY_PARAMETER);
    params.add(FREQUENCY_16k);
    params.add(FILE_TYPE_PARAMETER);
    params.add(FILE_TYPE_MP4);
    params.add(tmpFile);
    return params;
  }

  private void executeProcess(ProcessBuilder processBuilder) throws IOException, InterruptedException {
    Process process = processBuilder.start();
    String output = IOUtils.toString(process.getInputStream());
    String error = IOUtils.toString(process.getErrorStream());
    int returnCode = process.waitFor();
    if (logger.isDebugEnabled()) {
      logger.debug("Process sox ended with returnCode=" + returnCode);
      logger.debug("Standard Output: " + output);

    }
    if (StringUtils.isNotEmpty(error)) {
      logger.warn("Standard Error Output:" + error);
    }
  }

  private String joinNormalizedFiles(List<String> sameSampleRate) throws RequestFailedException {
    List<String> params = new ArrayList<String>();
    String resultFile = FileUtils.getTempDirectoryPath() + File.separator + TMP_FILE_PREFIX + new Random().nextInt() + System.currentTimeMillis() + TMP_FILE_SUFFIX;
    params.add(path_to_sox + SOX_PROCESS);
    params.addAll(sameSampleRate);
    params.add(resultFile);

    ProcessBuilder processBuilder = new ProcessBuilder(params);

    try {
      executeProcess(processBuilder);
    } catch (IOException e) {
      throw new RequestFailedException("Executing of join of audio files by sox failed", e);
    } catch (InterruptedException e) {
      throw new RequestFailedException("Executing of join of audio files by sox failed", e);
    }
    if (logger.isDebugEnabled()) {
      logger.debug("Couples join ended.");
      logger.debug("Result saved as" + resultFile);
    }
    return resultFile;
  }


}
