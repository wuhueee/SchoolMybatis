package mybatis_test;

import org.apache.ibatis.session.SqlSession;
import org.example.pojo.Academy;
import org.example.pojo.Course;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    @Test
    public void findCourseById(){
        SqlSession sqlSession = MybatisUtils.getSesstion();
        Course course = sqlSession.selectOne("org.example.pojo.findCourseById", 1);
        System.out.println(course);
        sqlSession.close();
    }
    @Test
    public void findCourseBySchoolName(){
        SqlSession sqlSession = MybatisUtils.getSesstion();
        Academy academy = sqlSession.selectOne("org.example.pojo.findCourseBySchoolName", "计算机学院");
        System.out.println(academy);
        sqlSession.close();
    }
    @Test
    public void updateCourse(){
        Course course=new Course();
        course.setId(4);
        course.setHours(40);
        SqlSession sqlSession = MybatisUtils.getSesstion();
        int i = sqlSession.update("org.example.pojo.updateCourse", course);
        System.out.println("更新的数据为"+i+"条");
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void insertCourse(){
        Course course=new Course();
        course.setName("大数据存储");
        course.setHours(32);
        course.setSid(1);
        SqlSession sqlSession = MybatisUtils.getSesstion();
        int i = sqlSession.insert("org.example.pojo.insertCourse", course);
        System.out.println("插入的数据为"+i+"条");
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void findAll(){
        SqlSession sqlSession = MybatisUtils.getSesstion();
        List List = sqlSession.selectList("org.example.pojo.findAll");
        for (Object o:List) {
            System.out.println(o);
        }
        sqlSession.close();
    }
}
