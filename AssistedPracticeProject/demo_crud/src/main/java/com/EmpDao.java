package com;
import java.util.*;  
    import java.sql.*;  
      
    public class EmpDao {  
      
        public static Connection getConnection(){  
             Connection con =null;
            try{  
                Class.forName("oracle.jdbc.driver.OracleDriver");  
                String url="jdbc:oracle:thin:@localhost:1521:orcl";
                String userName="scott";
                String password="raham";
                con=DriverManager.getConnection(url,userName,password);  
                System.out.println("SUCESS");
            }catch(Exception e){System.out.println(e);}  
            return con;  
        }  
        public static int save(EMP e){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "insert into userEMP(name,password,email,country) values (raham,raham,raham556@gmail.com,india)");  
                ps.setString(1,e.getName());  
                ps.setString(2,e.getPassword());  
                ps.setString(3,e.getEmail());  
                ps.setString(4,e.getCountry());  
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int update(EMP e){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "update userEMP set name=?,password=?,email=?,country=? where id=?");  
                ps.setString(1,e.getName());  
                ps.setString(2,e.getPassword());  
                ps.setString(3,e.getEmail());  
                ps.setString(4,e.getCountry());  
                ps.setInt(5,e.getId());  
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int delete(int id){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("delete from userEMP where id=?");  
                ps.setInt(1,id);  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return status;  
        }  
        public static EMP getEmployeeById(int id){  
            EMP e=new EMP();  
              
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from userEMP where id=?");  
                ps.setInt(1,id);  
                ResultSet rs=ps.executeQuery();  
                if(rs.next()){  
                    e.setId(rs.getInt(1));  
                    e.setName(rs.getString(2));  
                    e.setPassword(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setCountry(rs.getString(5));  
                }  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return e;  
        }  
        public static List<EMP> getAllEmployees(){  
            List<EMP> list=new ArrayList<EMP>();  
              
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from useEMP");  
                ResultSet rs=ps.executeQuery();  
                while(rs.next()){  
                    EMP e=new EMP();  
                    e.setId(rs.getInt(1));  
                    e.setName(rs.getString(2));  
                    e.setPassword(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setCountry(rs.getString(5));  
                    list.add(e);  
                }  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return list;  
        }  
    }  
