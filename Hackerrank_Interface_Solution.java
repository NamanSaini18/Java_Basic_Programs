// Below is the solution of Hackerrank problem named Java Interface
// If you have a better approach then feel free to contact me and you can also create pull request
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
            
        }
        return sum;
    }
