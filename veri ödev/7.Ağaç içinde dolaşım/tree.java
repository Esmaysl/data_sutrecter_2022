
public class tree {
    Node root;//root tanımlandı
    public tree(){  //NESNE OLUŞTURULUR
        root=null;}
      Node newNode(int data) {  //newnode fonksiyonu oluşturulur
        root=new Node(data);
        System.out.println(data + "--> agaca eklendi");
        return root;
        }
        Node insert(Node root, int data){
            if(root!=null){
                if (data<root.data)
                    root.left=insert(root.left,data);
                    else
                        root.right=insert(root.right,data);

                    }
                else
                    root=newNode(data);
                    return root;
                
            }
        
         void preorder(Node root){
            if(root!=null){
                System.out.print(root.data +" ");
                preorder(root.left);
                preorder(root.right);

            }
         }
         void inorder(Node root){
            if(root!=null){
                inorder(root.left);
                System.out.print(root.data +" ");
                inorder(root.right);

            }
         }

         void postorder(Node root){
            if(root!=null){
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data +" ");

            }
         }
    }

