package com.onboarding.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val memberClass = MemberClass()

    class MemberClass {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myActiviy = MyActiviy()
        Log.d("ClassCannonicalName", myActiviy::class.java.canonicalName)
        if (myActiviy::class.java.componentType != null)
            Log.d("ComponentType", myActiviy::class.java.componentType.canonicalName)
        else
            Log.d("ComponentType", "null")
        if (myActiviy::class.java.enclosingClass != null)
            Log.d("EnclosingClass", myActiviy::class.java.enclosingClass.canonicalName)
        else
            Log.d("EnclosingClass", "null")
        Log.d("ClassName", myActiviy::class.java.name)

        // Array
        val myActivies = arrayOf<MyActiviy>()
        Log.d("ClassCannonicalName2", myActivies::class.java.canonicalName)
        if (myActivies::class.java.componentType != null)
            Log.d("ComponentType2", myActivies::class.java.componentType.canonicalName)
        else
            Log.d("ComponentType2", "null")
        if (myActivies::class.java.enclosingClass != null)
            Log.d("EnclosingClass2", myActivies::class.java.enclosingClass.canonicalName)
        else
            Log.d("EnclosingClass2", "null")
        Log.d("ClassName2", myActivies::class.java.name)

        // get simple name
        myActiviy = MyActiviy()
        Log.d("SimpleName", myActiviy::class.java.simpleName)
        Log.d("isMemberClass", myActiviy::class.java.isMemberClass.toString())

        // member class
        Log.d("isMemberClass2", memberClass::class.java.isMemberClass.toString())
        Log.d("memberCannonicalName", memberClass::class.java.canonicalName)
        Log.d("enclosingClass", memberClass::class.java.enclosingClass.canonicalName)
        Log.d("declaringClass", memberClass::class.java.declaringClass.canonicalName)
    }
}