if(NOT TARGET cxx::cxx)
add_library(cxx::cxx STATIC IMPORTED)
set_target_properties(cxx::cxx PROPERTIES
    IMPORTED_LOCATION "/home/mirin/.gradle/caches/8.12.1/transforms/bdb59e250da252941f77b7f21331fcf1/transformed/libcxx-27.0.12077973/prefab/modules/cxx/libs/android.armeabi-v7a/libcxx.a"
    INTERFACE_INCLUDE_DIRECTORIES "/home/mirin/.gradle/caches/8.12.1/transforms/bdb59e250da252941f77b7f21331fcf1/transformed/libcxx-27.0.12077973/prefab/modules/cxx/include"
    INTERFACE_LINK_LIBRARIES ""
)
endif()

