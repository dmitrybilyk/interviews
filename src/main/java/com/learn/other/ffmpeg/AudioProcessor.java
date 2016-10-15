package com.learn.other.ffmpeg;

import java.util.List;

/**
 * Radek Mensik, 7.2.13
 */
public interface AudioProcessor {

public String convertAndMix(List<String> sourceFiles) throws RequestFailedException;
}
