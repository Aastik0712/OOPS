import java.util.*;
class Recipe{
    public String item;
    public String[] str;
    public Recipe(String item,String[] str){
        this.item=item;
        this.str=str;
    }
    public void display(){
        System.out.println("Recipe:"+item);
        for(int i=0;i<str.length;i++){
            System.out.println(i+":"+str[i]);
        }
    }
}
public class lec01{
    public static void main(String[] args) {
        Recipe[] recipe={
            new Recipe("Pizza", new String[]{"a","b","c","d"}),
            new Recipe("Kachori", new String[]{"a","b","c","d"}),
            new Recipe("Jeera", new String[]{"a","b","c","d"})
        };
        for(Recipe recipes: recipe){
            recipes.display();
            System.out.println();
        }
    }
}