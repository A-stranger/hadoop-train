package cn.studybigdata.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class MockData {

    public static Connection connection;


    public static void main(String[] args) throws IOException {


        Configuration hbaseConf = HBaseConfiguration.create();
        hbaseConf.set("hbase.zookeeper.quorum", "node1");
        hbaseConf.set("hbase.zookeeper.property.clientPort", "2181");

        //拿到connection对象
        getConnection(hbaseConf);

        createTable();


        TableName tableName = TableName.valueOf("student");

        for (int i = 100000; i < 500000; i++) {
            String rowKey = String.valueOf(i);
            //插入数据
            addValue(tableName, rowKey, "Info", "Name",
                    "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdnddiaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni");
            addValue(tableName, rowKey, "Info", "Sex",
                    "malendisiniasdnjidvnjivadnjiavniasduiasuisdavuiasdvdvabiadvnjasdvadvsdanjkdvnjasdiiiioasioasdioasdioaioasdioasdiojasd-asn" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdnoasdnoasinaniasdniasdinasdinjasdsniva");
            addValue(tableName, rowKey, "Score", "Hadoop",
                    "95isovnoivanioanoanoasdvonsdaiocioxioaiosdioaniooooooooooooooooofaionasvdndasdnoasdnkdsdddddddddssdsdsoanasdnidanosdanjod" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodooasdnoasinaniasdniojasdo");
            addValue(tableName, rowKey, "Score", "HBase",
                    "nioanioasdsionadfnioasdnoasdnkoksdanosdvnovonvnosdvnodvoajoajioaioasioasdoiasdoivanioadnoviasdinioainjadnasdnjsnmasdijrui" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsassdakooasdnoasinaniasdnieuivvgadfniakoasdn" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni");
            addValue(tableName, rowKey, "Score", "Spark",
                    "aninnioamsvaioasdiojasdioasjioasdvioasdvioavnianioavavdvaniodvdvasinoioasdioainoniodvioaiosadivovnaioanioasdjsdaniasdnini" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdndddddddddddss" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdndoasinaniasdi" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni" +
                            "duanyusssssssssssdaffasakjoasdiasfuiasdsdanjiasdnjsdanjkdvjsdavnjvasdnjvdnjsdanjsdniaoiasdniodassdakooasdnoasinaniasdni");

            System.out.println(rowKey);
        }
    }


    /**
     * @param hbaseConf
     */
    public static void getConnection(Configuration hbaseConf) {

        try {
            connection = ConnectionFactory.createConnection(hbaseConf);
        } catch (IOException e) {
            System.out.println("链接不上Zookeeper了，你再检查检查。。。");
            e.printStackTrace();
        }
    }

    /**
     * 创建表
     *
     * @return
     */
    public static void createTable() {
        try {
            Admin admin = connection.getAdmin();

            // 表名
            TableName tableTest = TableName.valueOf("student");

            //判断表是否存在
            boolean exists = admin.tableExists(tableTest);
            if (exists) {
                System.out.println("表已存在！");
                return;
            }

            // 表描述
            HTableDescriptor tableDesc = new HTableDescriptor(tableTest);


            // 列族 Info
            HColumnDescriptor studentInfo = new HColumnDescriptor("Info");
            // 列族 Score
            HColumnDescriptor studentScore = new HColumnDescriptor("Score");

            tableDesc.addFamily(studentInfo);
            tableDesc.addFamily(studentScore);
            // 创建表
            admin.createTable(tableDesc);

            // 日志提示一下
            System.out.println("创建表成功~");

        } catch (IOException e) {
            System.out.println("创建表失败，失败原因如下：");
            e.printStackTrace();
        }
    }

    /**
     * 向某单元格插入数据
     *
     * @param tableName
     * @param rowKey
     * @param family
     * @param column
     * @param value
     * @throws IOException
     */
    public static void addValue(TableName tableName, String rowKey, String family, String column, String value) throws IOException {

        Table table = connection.getTable(tableName);

        Put put = new Put(Bytes.toBytes(rowKey));
        put.addColumn(Bytes.toBytes(family), Bytes.toBytes(column), Bytes.toBytes(value));
        table.put(put);
        table.close();
        System.out.println("新增数据成功！");
    }

}
