import java.util.LinkedList;
import java.util.Iterator;

class TrafficLight {
    enum State {
        RED /*{
            @Override
            State cycle(TrafficLight t) {
                t.direction = t.direction==GREEN ? GREEN_LEFT_ONLY : GREEN;
                return t.direction;
            }
        }*/,

        GREEN /*{
            @Override
            State cycle(TrafficLight t) { return YELLOW; }
        },

        GREEN_LEFT_ONLY*/,

        YELLOW {
            @Override
            void delay() {
                try { Thread.sleep(1000); } catch(Exception e){}
            }

            @Override
            State cycle(TrafficLight t) { return RED; }
        };

        void delay() {
            try { Thread.sleep(4000); } catch(Exception e){}
        }

        State cycle(TrafficLight t) {
            return State.values()[t.state.ordinal()+1];
        }
    }  // end enum

    State[] states = State.values();
    State state = State.RED;
    /*State direction = State.GREEN_LEFT_ONLY;*/

    TrafficLight() {
        while (true) {
            System.out.println(state);
            state.delay();
            state = state.cycle(this);
        }
    }
}
