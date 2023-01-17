public class Worker {
    private Main.OnTaskDoneListener callback;
    private Main.OnTeskErrorListener errorCallback;

    public Worker (Main.OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker (Main.OnTeskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + "is done");
        }
    }

    public void start2() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task" + i + "is UNDONE!!!");
            } else {
                errorCallback.onError("Task " + i + "is done");
            }
        }
    }
}
