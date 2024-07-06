class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int r=prerequisites.length;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i!=j && prerequisites[i][1]==prerequisites[j][0]){
                    if(prerequisites[i][0]==prerequisites[j][1])
                    return false;
                    else
                    continue;
                }
                else
                continue;
            }
        }
        return true;
    }
}

// 41 out of 52 test cases passed.
// solution doesnt solve complex dependencies between courses.
