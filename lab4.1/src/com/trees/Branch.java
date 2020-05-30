package com.trees;

import java.util.Objects;

public class Branch extends Leaves {
    private int branchCount;

    public Branch(String color, int branchCount, int leavesCount) {
        super(color, leavesCount);
        this.branchCount = branchCount;
    }

    public Branch() {
        super();
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Branch branch = (Branch) o;
        return Objects.equals(branchCount, branch.branchCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), branchCount);
    }

    @Override
    public String toString() {
        return super.toString() + "com.trees.Branch:" +
                "BranchCounter='" + branchCount;
    }
}