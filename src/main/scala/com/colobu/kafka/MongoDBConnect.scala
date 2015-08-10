package com.colobu.kafka

import com.mongodb.casbah.MongoClient
import com.mongodb.casbah.commons.MongoDBObject

/**
 * Created by shenzhao on 8/10/15.
 */
object MongoDBConnect extends App{
  val mongoClient = MongoClient("192.168.100.2", 27017)
  val db = mongoClient("test")
  val coll = db("test")
  val mongoObject = MongoDBObject("key" -> "value")
  coll.insert(mongoObject)
  System.out.println("connect mongodb successful")
}
