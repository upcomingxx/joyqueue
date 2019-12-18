/**
 * Copyright 2019 The JoyQueue Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.chubao.joyqueue.nsr.service.internal;


import io.chubao.joyqueue.domain.AppToken;

import java.util.List;

/**
 * @author lixiaobin6
 * 下午3:11 2018/8/13
 */
public interface AppTokenInternalService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    AppToken getById(long id);

    /**
     * 根据app和token查询数据
     *
     * @param app
     * @param token
     * @return
     */
    AppToken getByAppAndToken(String app, String token);

    /**
     * 根据app查询
     * @param app
     * @return
     */
    List<AppToken> getByApp(String app);

    /**
     * 查询全部
     * @return
     */
    List<AppToken> getAll();

    /**
     * 添加
     * @param appToken
     * @return
     */
    AppToken add(AppToken appToken);

    /**
     * 修改
     * @param appToken
     * @return
     */
    AppToken update(AppToken appToken);

    /**
     * 删除
     * @param id
     */
    void delete(long id);
}