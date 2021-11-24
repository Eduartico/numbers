package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
     Integer div;

    public DivisibleByFilter(int i) {
    }

    void DivisibleByFilter(Integer div){
         this.div = div;
     }
    @Override
    public boolean accept(Integer number) {
        if (number%div == 0) return true;
        return false;
    }
}
