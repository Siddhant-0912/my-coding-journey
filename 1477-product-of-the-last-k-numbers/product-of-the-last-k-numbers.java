class ProductOfNumbers {

    List<Integer> product;
    public ProductOfNumbers() {
        product = new ArrayList<>();
        product.add(1);
        
    }
    
    public void add(int num) 
    {
        if(num==0){
        product.clear();
        product.add(1);
        }
        else
        {
            int lastpro=product.get(product.size()-1);
            product.add(lastpro*num);
        }

    
     
    }
    
    public int getProduct(int k) {
        int size=product.size();
        if(k>=size)
        return 0;// as 0 will be encountered in array
        else 
        return product.get(size-1)/product.get(size-1-k);//returning the product of last k element
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */