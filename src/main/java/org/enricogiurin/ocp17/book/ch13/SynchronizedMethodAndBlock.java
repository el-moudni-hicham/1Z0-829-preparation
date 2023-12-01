package org.enricogiurin.ocp17.book.ch13;

public class SynchronizedMethodAndBlock {

  //hello() and ciao() they are equivalent
  void hello() {
    synchronized (this) {
      System.out.println("Hello");
    }
  }
  synchronized void ciao() {
    System.out.println("ciao");
  }
}
