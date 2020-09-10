public class ThisEscape {
    private boolean isInited = false;
    private String system = null;

    public ThisEscape(View view) {
        view.addListener(new Listener() {
            @Override
            public void onClick() {
                printSystemInfo();
            }
        });

        system = "Ubuntu";
        isInited = true;
    }

    private void doSomething() {
        System.out.println("System: "+ system + " , is initialized: " + isInited);
    }

    public static void main(String[] args) {
        View view = new View();
        ThisEscape escape = new ThisEscape(view);
        view.onClick();
    }
}

class View {
    private Listener lis = null;
    public View() {
        // ignore
    };
    
    public void addListener(Listener listener) {
        lis = listener;
    }

    public void onClick() {
        if(lis != null) {
            lis.onClick();
        }
    }
}

interface Listener {
    void onClick();
}