public enum MathOperation{
    ADD(10, 20){
      @Override
      public int apply(int x, int y){
          return x + y;
      }
    },
    SUBTRACT(293, 90){
        @Override
        public int apply(int x, int y){
            return x - y;
        }
    },
    MULTIPLY(38483, 384){
        @Override
        public int apply(int x, int y){
            return x * y;
        }
    },
    DIVIDE(944, 3){
        @Override
        public int apply(int x, int y){
            if(y != 0){
                return x / y;
            }else{
                throw new IllegalArgumentException("Cannot divide by 0");
            }
        }
    };
    MathOperation(int x, int y){
        this.x = x;
        this.y = y;
    }
    private int x;
    private int y;
    public abstract int apply(int x, int y);
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}