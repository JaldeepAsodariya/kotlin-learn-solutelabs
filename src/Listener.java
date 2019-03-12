public interface Listener {
    void onAction();
}

class Sample {
    public static void main(String[] args) {
        get(new Listener() {
            @Override
            public void onAction() {

            }
        });
    }

    static void get(Listener listener) {

    }
}
