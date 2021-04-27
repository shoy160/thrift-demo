namespace java com.yunzhicloud.thrift
namespace go thrift

service MathService {
    i32 Add(1:i32 A, 2:i32 B)
}