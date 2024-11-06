public class Double_link_list {

    Node head;
    Node tail;


    Double_link_list(){

        head = null;
        tail = null;

    }

    public boolean isempty(){

        if(head == null){

            return true;
        }

        return false;
    }

    public void CreateNode(int data){

        Node newNode = new Node(data);


        if(isempty()){

            tail = newNode;
            head = newNode;

        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }



    public void Insert_end(int data){
        System.out.println("New List is:");

        Node newNode = new Node(data);
        Node current = tail;

        current.next = newNode;
        newNode.prev = current;

    }


    public void Insert_Middle(int pos , int value){

        System.out.println("New List is:");

        Node newNode = new Node(value);
        int count = 1;

        Node current = head;
        while(current.next!= null&& count<pos -1){

            current = current.next;
            count++;

        }

        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;
        newNode.next.prev = newNode;


    }


    public void Delete_first(){

        System.out.println("New list is:");

        if(isempty()){

            System.out.println("List is empty");
        }

        else {


            head = head.next;
            head.prev = null;
        }

    }


    public void Delete_middle(int value){

        System.out.println("New List is:");


        Node current = head;

        while(current.next!=null){

            if(current.next.data==value){

                current.next.next.prev =  current;
                current.next = current.next.next;

            }

            current = current.next;

        }
    }


    public void Delete_end(){

        System.out.println("New List is :");

        if(isempty()){
            System.out.println("List is Empty:");
        }

        Node current = tail;
        current.prev.next = null;

    }

    public void Reverse(){

        System.out.println("Reverse is:");


        if(isempty()){

            System.out.println("List is Empty");
        }

        Node current = tail;

        while (current!=null){

            System.out.println(current.data);
            current = current.prev;

        }

    }


    public void Max(){

        Node current = head;

        int max = head.data;
        while(current!=null){

            if(current.data>max){

                max = current.data;
            }
            current = current.next;
        }

        System.out.println("Max Number is:"+max);



    }

    public void Min(){

        Node current = head;

        int min = head.data;
        while(current!=null){

            if(current.data<min){

                min = current.data;
            }
            current = current.next;
        }

        System.out.println("Minimum Number is:"+min);

    }

    public void Sum(){

        if (isempty()){

            System.out.println("List is Empty:");

        }

        System.out.println("Sum of list is:");

        Node current = head;
        int sum=0;

        while(current!=null){

            sum += current.data;

            current = current.next;


        }

        System.out.println(sum);

    }


    public void Print(){

        Node current = head;

        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }



    }

}