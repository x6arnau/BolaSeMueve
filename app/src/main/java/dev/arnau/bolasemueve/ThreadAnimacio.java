package dev.arnau.bolasemueve;

public class ThreadAnimacio extends Thread {
    CerclesView cView;

    public ThreadAnimacio(CerclesView v) {
        cView = v;
    }

    public void run() {
        try {
            while (true) {
                sleep(20);
                // Movem els elements
                cView.mou();
                // Mirem si hi ha col·lisions
                cView.colisions();
                // Repintem
                cView.postInvalidate();
            }
        } catch (Exception e) {

        }
    }
}
