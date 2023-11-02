import static java.lang.System.out;

class GumballMachine {
    static enum State {
        SOLD_OUT,
        
        NO_QUARTER {
            @Override
            State insertQuarter() {
                out.println("You inserted a quarter");
                return HAS_QUARTER;
            }
        },
        
        HAS_QUARTER {
            @Override
            State ejectQuarter() {
                out.println("Quarter returned");
                return NO_QUARTER;
            }
            
            @Override
            State turnCrank(GumballMachine machine) {
                out.println("You turned...");
                out.println("A gumball comes rolling out the slot");
                machine.mCount -= 1;
                if (machine.mCount == 0) {
                    out.println("Out of gumballs!");
                    return SOLD_OUT;
                } else {
                    return NO_QUARTER;
                }
            }
            
        };
        
        State insertQuarter() {
            out.println("You can't insert a quarter");
            return this;
        }
        
        State ejectQuarter() {
            out.println("Unable to eject quarter");
            return this;
        }
        
        State turnCrank(GumballMachine machine) {
            out.println("Can't turn crank");
            return this;
        }
    }
    
    State mState = State.SOLD_OUT;
    int mCount = 0;
    
    void insertQuarter() { mState = mState.insertQuarter(); }
    void ejectQuarter() { mState = mState.ejectQuarter(); }
    void turnCrank() { mState = mState.turnCrank(this); }
    
    public GumballMachine(int count) {
        mCount = count;
        if (mCount > 0) {
            mState = State.NO_QUARTER;
        }
    }
    
    public void refill(int numGumBalls) {
        mCount = numGumBalls;
        mState = State.NO_QUARTER;
    }
    
    public String toString() {
        return "\nMighty Gumball, Inc."+
               "\nJava-enabled Standing Gumball Model #2004\n"+
               "Inventory: "+ mCount +" gumball"+ (mCount != 1 ? "s" : "")+
               "\nMachine: "+ mState.toString().toLowerCase().replace('_',' ') +"\n";
    }
}
