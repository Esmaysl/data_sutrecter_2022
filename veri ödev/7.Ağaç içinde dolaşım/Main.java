public class Main {
    /**
     * @param args
     */
    public static void  main(String[] args) {
        tree bts= new tree();
        //ağacın içine düğüm eklencek
        bts.root=bts.insert (bts.root,10);
        bts.root=bts.insert(bts.root,15);
        bts.root=bts.insert(bts.root,8);
        bts.root=bts.insert(bts.root,20);
        bts.root=bts.insert(bts.root,4);
        bts.root=bts.insert(bts.root,12);
        bts.root=bts.insert(bts.root,9);
        
        System.out.print(" preorder:");

        bts.preorder(bts.root);
        System.out.println();

        System.out.print(" inorder:");
        bts.inorder(bts.root);

        System.out.println();

        System.out.print(" postorder:");
        bts.postorder(bts.root);

       

        

    }
}
