public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());

        adapter.chooseFirstSelection();
        adapter.chooseSecondSelection();
    }
}

interface CoffeeMachineInterface {

    String chooseFirstSelection();
    String chooseSecondSelection();
}

class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    OldCoffeeMachine machine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine machine){
        this.machine = machine;
    }

    public String chooseFirstSelection() {
        this.machine.selectionA();
        return this.machine.selectionA();
    }

    public String chooseSecondSelection() {
        this.machine.selectionB();
        return this.machine.selectionB();
    }
}

class OldCoffeeMachine {

    public String selectionA(){
        System.out.println("selected A");
        return "Selected A";
    }

    public String selectionB(){
        System.out.println("selected B");
        return "Selected B";
    }
}