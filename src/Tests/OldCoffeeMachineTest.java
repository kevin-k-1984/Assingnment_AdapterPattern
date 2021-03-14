import org.junit.Test;

import static org.junit.Assert.*;

public class OldCoffeeMachineTest {

    @Test
    public void TestOldCoffeeMachine(){
        OldCoffeeMachine machine = new OldCoffeeMachine();

        assertEquals("Selected A", machine.selectionA());
        assertEquals("Selected B", machine.selectionB());
    }

    @Test
    public void TestCoffeeMachineTouchScreen(){
        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());

        assertEquals("Selected A", adapter.chooseFirstSelection());
        assertEquals("Selected B", adapter.chooseFirstSelection());
    }
}