package com.dsa.Queue.implementation;


public class CircularQueueArray {
    public static class cQueue{
        private int front = -1;
        private int rear = -1;
        private int size = 0;
        private int[] arr = new int[5];

        public void add(int data) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full");
            }else if(size == 0){
                front = rear = 0;
                arr[0] = data;
            }else if(rear<arr.length-1){
                arr[++rear] = data;
            }else if(rear == arr.length-1){
                rear = 0;
                arr[0] = data;
            }
            size++;
        }


        public int remove() throws Exception {
            if(size == 0){
                throw new Exception("Queue is EMPTY!");
            }else if(front == arr.length -1){
                int val = arr[front];
                front = 0;
                size--;
                return val;
            }else{
                int val = arr[front];
                front++;
                size--;
                return val;
            }

        }

        public int peek() throws Exception{
            if(front == -1  && rear == -1){
                throw new Exception("QUEUE IS EMPTY");
            }
            return arr[front];
        }
        public void display() throws Exception{
            if(front<rear){
                for(int i = front; i<= rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }else if(front>rear){
                for(int i = front; i<=arr.length-1;i++){
                    System.out.print(arr[i]+ " ");
                }
                for (int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }else{
                throw new Exception("Queue is EMPTY");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception{
        cQueue c1 = new cQueue();

        c1.add(5);
        c1.add(4);
        c1.add(3);
        c1.add(2);
        c1.display();
        c1.remove();
        c1.remove();
        c1.display();
        c1.add(6);
        c1.add(7);
        c1.add(8);
        c1.display();
    }
}
