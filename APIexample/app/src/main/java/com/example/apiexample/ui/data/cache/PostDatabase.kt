package com.example.apiexample.ui.data.cache

@Database(
    entities = (Post::class),
    version = 1,
    exportScheme = false
)
abstract class PostDatabase {
    abstract fun postDao(): PostDAO

    companion object{
        const val DATABASE_NAME = "Post_database"

        @Volatile
        private var INSTANCE: PostDatabase? = null

        fun getInstance(context: Context): PostDatabase{
            return INSTANCE ?: synchronized(lock = this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PostDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}