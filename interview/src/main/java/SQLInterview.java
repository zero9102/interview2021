package main.java;

public class SQLInterview {

    // https://blog.csdn.net/lcs353732057/article/details/78296356
    public static void main(String[] args) {
        // 交换2列的值.
        // update person p, person p2 set p.name = p2.desc, p.desc = p2.desc where p.id=222;
        // 分页查询， id 索引，不连续递增， 求100000 - 100010 的sql 分页.
        // select id,title from collect where id>=(select id from collect order by id limit 100000,1) limit 10;
        // 带where 条件的采用复合索引. 只要查找出id， 那么就好办....
        // left join
        // test.user, test.city

        /**
        select p.name, c.cityname from person p
        left join
        city c
        on c.pid = p.id  WHERE c.cityname is null;
         */
        // where 查询在left join 结果出来后， 再执行查询条件。 注意和and 的区别.

        /*
        select p.name, c.cityname from person p
        left join
        city c
        on c.pid = p.id  and
        c.cityname is null;
         */
        // 全部查出来. cityname = null

        /*
        select p.name, c.cityname from person p
        inner join
        city c
        on c.pid = p.id  where
        c.cityname is null;
         */
        // 全部都没有查出来.

        /*
        select p.name, c.cityname from person p
        inner join
        city c
        on c.pid = p.id  and
        c.cityname is null;
         */
        // 全部都没有查出来.

    }

}
