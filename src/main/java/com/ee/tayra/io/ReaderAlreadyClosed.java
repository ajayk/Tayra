package com.ee.tayra.io;

public class ReaderAlreadyClosed extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ReaderAlreadyClosed(final String message) {
    super(message);
  }

}