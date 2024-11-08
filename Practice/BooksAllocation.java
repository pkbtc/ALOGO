public class BooksAllocation {
    public static void main(String[] args) {
        
    }
    public static int booksAllocation(int[] books,int student){
        if(books.length<student){
            return -1;
        }
        int res=-1;
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<books.length;i++){
            if(books[i]>start){
                start=books[i];
            }
            end+=books[i];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAllocation(books, mid, student)){
                res=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return res;
        

    }
    private static boolean isAllocation(int[] books,int maxPage,int student){
        int currentPage=0;
        int currentStudent=1;
        for(int i=0;i<books.length;i++){
            currentPage+=books[i];
            if(currentPage>maxPage){
                currentStudent++;
                currentPage=books[i];
            }
            if(currentStudent>student){
                return false;
            }


        }
        return true;
    }
}
