package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/4/9 - 0:20
 **/
public class _780 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {

        while (tx>sx&&ty>sy&&tx!=ty) {
            if (tx>ty) {
                tx%=ty;
            }else{
                ty%=tx;
            }
        }
        if (sx==tx&&sy==ty) {
            return true;
        }else if (tx==sx) {
            return  ty>sy&&(ty-sy)%tx==0;
        }else if (sy==ty) {
            return tx>sx&&(tx-sx)%ty==0;
        }else {
            return  false;
        }
    }


}
