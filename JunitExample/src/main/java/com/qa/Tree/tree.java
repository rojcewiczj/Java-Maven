package com.qa.Tree;

import java.util.*;

public class tree {
    public List<Root> roots = new ArrayList<Root>();
    public List<Branch> branches = new ArrayList<Branch>();
    public Trunk trunk;
    public String type;


    public tree(String _type, Land land){
        type = _type;
        int num_of_branchs = land.SunLight;
        int num_of_roots = land.AmountOfWater;
        for(int i = num_of_branchs; i > 0; i --){
            Branch new_branch = new Branch();
            branches.add(new_branch);
        }
        for(int i = num_of_roots; i > 0; i --){
            Root new_root = new Root();
            roots.add(new_root);
        }
        
       
    }
}
