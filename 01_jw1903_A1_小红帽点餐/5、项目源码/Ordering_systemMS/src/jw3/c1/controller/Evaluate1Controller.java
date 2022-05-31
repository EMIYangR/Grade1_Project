package jw3.c1.controller;

import jw3.c1.model.Evaluate1;
import jw3.c1.utils.QueryByClass;

import java.util.List;

public class Evaluate1Controller {
    static QueryByClass<Evaluate1> qc=new QueryByClass<Evaluate1>();
    public static List<Evaluate1> cx(){
        String sql="select * from evaluate1";
        List<Evaluate1> evaluate1s=qc.select(Evaluate1.class,sql);
        return evaluate1s;
    }
}
