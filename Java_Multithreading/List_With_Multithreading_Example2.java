import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_With_Multithreading_Example2 {
//    List multithread reads and reads the existing list object concurrently

//Test reading List About 34 seconds


    public class Main {

        public void main(String[] args) {

            List<String> list = new ArrayList<String>();
            Map<Long,Integer> map = new HashMap<Long,Integer>();

            for(int i = 0;i<1000;i++){
                list.add(""+i);
            }

            int pcount = Runtime.getRuntime().availableProcessors();
            long start = System.currentTimeMillis();

            for(int i=0;i<pcount;i++){

                Thread t = new MyThread1(list,map);
                map.put(t.getId(),Integer.valueOf(i));
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // System.out.println(list.get(i));
            }
            System.out.println("----"+(System.currentTimeMillis() - start));
        }
    }

//Thread class
    public class MyThread1 extends Thread {

        private List<String> list;
        private Map<Long,Integer> map;

        public MyThread1(List<String> list,Map<Long,Integer> map){
            this.list = list;
            this.map = map;
        }

        @Override
        public void run() {

            int pcount = Runtime.getRuntime().availableProcessors();
            int i = map.get(Thread.currentThread().getId());

            for(;i<list.size();i+=pcount){
                System.out.println(list.get(i));
            }
        }
    }
}
