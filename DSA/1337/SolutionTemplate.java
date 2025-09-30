class SolutionTemplate {
    public static void
    main(String[] args) {
        assert method() == 0;
        assert method() == 1;
    }

    static int
    method() {
        return 0;
    }

    static {
        boolean assertionsEnabled = false;
        assert assertionsEnabled = true;
        if (! assertionsEnabled) {
            throw new RuntimeException("\n\nEnable Assertions!\n\n");
        }
    }
}
