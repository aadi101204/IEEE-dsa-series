class StockSpanner {
    static class PairingTheStock{
        int quote;
        int span;
        PairingTheStock(int quote,int span){
            this.quote=quote;
            this.span=span;
        }
    }
    private Stack<PairingTheStock> stack;
    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!stack.isEmpty() && stack.peek().quote<=price)
        {
            PairingTheStock q=stack.pop();
            span=span+q.span;
        }
        stack.push(new PairingTheStock(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
