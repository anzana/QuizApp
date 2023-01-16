package com.example.quizapp.data

import com.example.quizapp.constants.Constant.IS_RADIO_BUTTON


class QuizFakeData {

    companion object {
        fun getQuizQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "1. Android is _____",
                    IS_RADIO_BUTTON,
                    "Android is a software package and linux based operating system for mobile devices such as tablet computers and smartphones.",
                    "a",
                    "an operating system",
                    "",
                    "",
                    mutableListOf("an operating system","a web browser", "a web server", "None")
                ),
                Quiz(
                    2,
                    "2. How to move services to foreground in android?",
                    IS_RADIO_BUTTON,
                    "We have to call  startFordgroud(int id, Notification notification) to make services as foreground services. When it comes to foreground, it will show a notification.",
                    "d",
                    " startFordgroud(int id, Notification notification)",
                    "",
                    "",
                    mutableListOf("Services always work in Foreground only","No, we can't do this query","Using startService(Intent intent)"," startFordgroud(int id, Notification notification)")
                ),
                Quiz(
                    3,
                    "3. What is broadcast receiver in android?",
                    IS_RADIO_BUTTON,
                    "It is a main component of android. It reacts on the system broadcast announcements, and it acts as a gateway between outside application environment with your application.",
                    "a",
                    "It will react on broadcast announcements.",
                    "",
                    "",
                    mutableListOf("It will react on broadcast announcements","It will do background functionalities as services","It will pass the data between activities","None")
                ),
                Quiz(
                    4,
                    "4. Which of the following virtual machine is used by the Android operating system?",
                    IS_RADIO_BUTTON,
                    "The Dalvik Virtual Machine (DVM) is an android virtual machine optimized for mobile devices. It optimizes the virtual machine for memory, battery life, and performance.",
                    "b",
                    "Dalvik virtual machine",
                    "",
                    "",
                    mutableListOf("JVM","Dalvik virtual machine","Simple virtual machine","None of the above")
                ),
                Quiz(
                    5,
                    "5. How to access the context in android content provider?",
                    IS_RADIO_BUTTON,
                    "The getContext() method is used in onCreate() method and getApplicationContext() can be used anywhere in an application." ,
                    "d",
                    "A & C",
                    "",
                    "",
                    mutableListOf("Using getContext() in onCreate()","Using intent()","Using getApplicationContext() at anywhere in an application","A & C both")
                ),
                Quiz(
                    6,
                    "6. APK stands for _____",
                    IS_RADIO_BUTTON,
                    "An APK is a short form of the Android Package Kit. An APK file is the file format used to install the applications on the android operating system.",
                    "c",
                    "Android Package Kit",
                    "",
                    "",
                    mutableListOf("Android Phone Kit","Android Page Kit","Android Package Kit", "Application Programming Interface")
                ),
                Quiz(
                    7,
                    "7. What is singleton class in android?",
                    IS_RADIO_BUTTON,
                    "There is only an object which can be accessed by all other class.",
                    "a",
                    "A class that can create only one object",
                    "",
                    "",
                    mutableListOf("A class that can create only one object","Anonymous class","Java class", "Manifest file")
                ),
                Quiz(
                    8,
                    "10.  How to fix crash using log cat in android?",
                    IS_RADIO_BUTTON,
                    "Using with log cat, we can find the exception, which has occurred along with the line number. Using of line number, we can find the errors.",
                    "b",
                    "log cat contains the exception name along with the line number",
                    "",
                    "",
                    mutableListOf("Gmail","log cat contains the exception name along with the line number","Google search", "None")
                ),
                Quiz(
                    9,
                    "12. Which of the following android component displays the part of an activity on screen?",
                    IS_RADIO_BUTTON,
                    "Android Fragment is the part of activity; it is also known as sub-activity. There can be more than one fragment in an activity. Fragments represent multiple screens inside one activity.",
                    "d",
                    "Fragment",
                    "",
                    "",
                    mutableListOf("View","Manifest","Gradle","Fragment")
                ),
                Quiz(
                    10,
                    "13. Which of the following is the parent class of Activity?",
                    IS_RADIO_BUTTON,
                    "The android Activity is the subclass of ContextThemeWrapper class. Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. An activity is a single screen in android. It is like a window or frame of Java.",
                    "c",
                    "contextThemeWrapper",
                    "",
                    "",
                    mutableListOf("context","object","contextThemeWrapper","None of the above")
                ),
                Quiz(
                    11,
                    "15. Which of the following method is used by services to clean up any services?",
                    IS_RADIO_BUTTON,
                    "The onDestroy() method can be used by services to clean up any resources like receivers, threads, registered listeners, etc.",
                    "c",
                    "onDestroy() method",
                    "",
                    "",
                    mutableListOf("onStop() method","stopService() method","onDestroy() method","stopSelf() method")
                )
            )
        }
    }
}