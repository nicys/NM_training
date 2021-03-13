package ru.netology.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.Post

class PostRepositoryInMemoryImpl : PostRepository {
    private var post = Post(
        id = 1,
        author = "Нетология. Университет интернет-профессий будущего",
        published = "21 мая в 18:36",
        content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу." +
                " Затем появились курсы по дизайну, разработке, аналитике и управлению. " +
                "Мы растем сами и помогаем расти студентам: от новичков до уверенных профессионалов. " +
                "Но самое важно остается с нами: мы верим, что в каждом уже есть сила, которая " +
                "заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия - помочь встать" +
                " на путь роста и начать цепочку перемен → http://netolo.gy//fyb",
        likeByMe = false
    )
    private val data = MutableLiveData<Post>()

    override fun get(): LiveData<Post> = data

    override fun like() {
        post = post.copy(likeByMe = !post.likeByMe)
        data.value = post
    }
}