public class Main {
    public static void main(String[] args) {
        //OnTaskDoneListener listener = System.out::println;
        //Worker worker = new Worker(listener);
       //worker.start();

        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start2();
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result );
    }

    @FunctionalInterface
    public interface OnTeskErrorListener {
        void onError(String resilt );
    }
}