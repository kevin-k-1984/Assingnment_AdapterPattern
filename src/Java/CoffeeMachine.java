public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());

        adapter.chooseFirstSelection();
        adapter.chooseSecondSelection();
    }
}

interface CoffeeMachineInterface {

    void chooseFirstSelection();
    void chooseSecondSelection();
}

class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    OldCoffeeMachine machine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine machine){
        this.machine = machine;
    }

    public void chooseFirstSelection() {
        this.machine.selectionA();
    }

    public void chooseSecondSelection() {
        this.machine.selectionB();
    }
}

class OldCoffeeMachine {

    void selectionA(){
        System.out.println("selected A");
    }

    void selectionB(){
        System.out.println("selected B");
    }
}