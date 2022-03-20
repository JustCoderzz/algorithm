package Á¦¿ÛÖÜÈü;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/3/20 - 11:10
 **/
public class _2 {
    public int countCollisions(String directions) {

        Deque<Character> stack=new LinkedList<>();
        int count=0;
        for(int i=0;i<directions.length();i++){
            Character c=directions.charAt(i);
            if(c=='R'){
                stack.push('R');
            }
            if(c=='L'){
                if(stack.isEmpty()) continue;
                else {
                    Character tmp=stack.peek();
                    if(tmp=='L'){
                        continue;
                    }else if(tmp=='R'){
                        count+=2;
                        stack.pop();
                        while(!stack.isEmpty()&&stack.peek()=='R'){
                            count+=1;
                            stack.pop();
                        }
                        stack.push('S');
                    }else {
                        count+=1;
                        stack.push('S');
                    }
                }
            }
            if(c=='S'){
                if(stack.isEmpty()) stack.push('S');
                else{
                    Character tmp=stack.peek();
                    if(tmp=='R'){
                        count+=1;
                        stack.pop();
                        while(!stack.isEmpty()&&stack.peek()=='R'){
                            count+=1;
                            stack.pop();
                        }
                        stack.push('S');
                    }
                }
            }

        }
        return count;
    }
}
