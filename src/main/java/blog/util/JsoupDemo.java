/**
 * FileName: JsoupDemo
 * Author:   hy
 * Date:     2019/11/7 8:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blog.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupDemo {
    public static void main(String[] args) throws Exception{
        //声明文档变量
        Document document;
        //通过Jsoup连接目标页面
        document = Jsoup.connect("https://www.mosoteach.cn/web/index.php?c=interaction&m=index&clazz_course_id=70722C73-9395-11E9-A9F1-98039B1848C6").get();
        //选取所有class为cal-xs-8集合
        Elements divs = document.getElementsByClass("col-xs-8");
        //对divs遍历
        divs.forEach(div->{
            //取出class为wrap的节点
            Element wrapDiv = div.child(0);
            Element link =  wrapDiv.child(0);
            Elements lingchildren = link.children();
            System.out.println(lingchildren.get(2).text());
        });
    }
}
