public class Worker {
    private Main.OnTaskDoneListener callback;
    private Main.OnTeskErrorListener errorCallback;

    public Worker (Main.OnTaskDoneListener callback, Main.OnTeskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task" + i + "is UNDONE!!!");
            } else callback.onDone("Task " + i + "is done");
        }
    }
}
