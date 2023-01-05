package advanced.Binary_Search_3;

public class tasks {
    public static void main(String[] args) {
        int[] tasks = {3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int workers= 4;
        System.out.println(solve(tasks, workers));
//        checkIfPossible(tasks, 16, workers);
    }

    static int solve(int[] tasks, int workers){
        int sum=0, max_task=0, answer=sum;
        for (int task : tasks){
            sum += task;
            max_task= Math.max(max_task, task);
        }
        int start=max_task, end=sum;
        while (start <= end){
            int mid = (start+end)/2;
            if (checkIfPossible(tasks, mid, workers)){
                System.out.println("For mid :"+mid+" : true");
                end= mid-1;
                answer= mid;
            }else{
                System.out.println("For mid :"+mid+" : false");
                start= mid+1;
            }

        }
        return answer;
    }

    static boolean checkIfPossible(int[] tasks, int max_time, int workers){
        int cur_worker_time=0, i=0;
        for (; i<tasks.length && workers>0; i++){
            if (cur_worker_time+tasks[i] <= max_time){
                cur_worker_time += tasks[i];
            } else {
                workers--;
                cur_worker_time=0;
                i--;
            }
        }
        if (workers==0 && i<tasks.length)
            return false;
        else
            return true;
    }
}
