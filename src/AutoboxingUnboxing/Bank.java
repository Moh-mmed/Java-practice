package AutoboxingUnboxing;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }
    public boolean addNewBranch(String branchName){
        if(branchExist(branchName)==-1){
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            return true;
        }
        return false;
    }
    private int branchExist(String branchName){
        if(branches.size()>0){
            for(Branch branch: branches){
                if(branch.getName().equals(branchName)) return branches.indexOf(branch);
            }
        }
        return -1;
    }
    public Branch findBranch(String branchName){
        int branchInd = branchExist(branchName);
        if(branchInd>=0){
            return branches.get(branchInd);
        }
        return null;
    }
    public Branch findCustomerBranch(String customerName){
        for(Branch branch:branches){
            for(Customer customer : branch.getCustomers()){
                if(customer.getName().equals(customerName)){
                    return branch;
                }
            }
        }
        return null;
    }
    public void makeTransaction(){

    }
}
