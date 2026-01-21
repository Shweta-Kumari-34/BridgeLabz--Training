package queueinterface;
import java.util.*;
public class CircularBufferSimulation {

	    static class CircularBuffer {
	        int[] buffer;
	        int capacity;
	        int front = 0;
	        int size = 0;

	        CircularBuffer(int capacity) {
	            this.capacity = capacity;
	            buffer = new int[capacity];
	        }

	        // Insert element
	        void insert(int x) {
	            int rear = (front + size) % capacity;
	            buffer[rear] = x;

	            if (size < capacity) {
	                size++;
	            } else {
	                // If buffer full overwrite oldest
	                front = (front + 1) % capacity;
	            }
	        }

	        // Display buffer
	        void display() {
	            System.out.print("[");
	            for (int i = 0; i < size; i++) {
	                System.out.print(buffer[(front + i) % capacity]);
	                if (i != size - 1) System.out.print(", ");
	            }
	            System.out.println("]");
	        }
	    }

	    public static void main(String[] args) {

	        CircularBuffer cb = new CircularBuffer(3);

	        cb.insert(1);
	        cb.insert(2);
	        cb.insert(3);
	        cb.display(); 

	        cb.insert(4); 
	        cb.display(); 

	        cb.insert(5); 
	        cb.display(); 
	    }
	}


