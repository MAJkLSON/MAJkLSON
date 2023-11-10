from pyspark.sql import SparkSession


if __name__ == '__main__':
    spark = SparkSession.builder.getOrCreate()
    df_alien = spark.read.csv('alien.csv', header=True)
    df_alien.where('Name = "Dallas"').show()
