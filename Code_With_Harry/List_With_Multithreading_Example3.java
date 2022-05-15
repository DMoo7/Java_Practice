import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class List_With_Multithreading_Example3 {

//    Scenario: big data List set, need to compare the data in the List set with the data in the standard database, generate new, update, cancel data
//    Solution:
//
//    List set segmentation,
//    Dynamically create thread pool newFixedThreadPool
//    Implementation of contrast operation in multithreading
    public static void main(String[] args) throws Exception {

        // start time
        long start = System.currentTimeMillis();
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= 3000; i++) {
            list.add(i + "");
        }
        // Open one thread for every 500 data
        int threadSize = 500;
        // Total number of data
        int dataSize = list.size();
        // Thread count
        int threadNum = dataSize / threadSize + 1;
        // Definition tag,filter threadNum Integers
        boolean special = dataSize % threadSize == 0;

        // Create a thread pool
        ExecutorService exec = Executors.newFixedThreadPool(threadNum);
        // Define a task set
        List<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
        Callable<Integer> task = null;
        List<String> cutList = null;

        // Determine the data for each thread
        for (int i = 0; i < threadNum; i++) {
            if (i == threadNum - 1) {
                if (special) {
                    break;
                }
                cutList = list.subList(threadSize * i, dataSize);
            } else {
                cutList = list.subList(threadSize * i, threadSize * (i + 1));
            }
            // System.out.println("The first" + (i + 1) + "Group:" + cutList.toString());
            final List<String> listStr = cutList;
            task = new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {
                    System.out.println(Thread.currentThread().getName() + "Threading:" + listStr);
                    return 1;
                }
            };
            // The task container list submitted here and the returned Future The list has a sequence corresponding relationship
            tasks.add(task);
        }

        List<Future<Integer>> results = exec.invokeAll(tasks);

        for (Future<Integer> future : results) {
            System.out.println(future.get());
        }

        // Close thread pool
        exec.shutdown();
        System.out.println("End of thread task execution");
        System.err.println("Task execution consumed:" + (System.currentTimeMillis() - start) + "Millisecond");
    }
}
