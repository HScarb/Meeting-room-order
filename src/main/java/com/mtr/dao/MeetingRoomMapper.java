package com.mtr.dao;

import com.mtr.model.MeetingRoom;
import com.mtr.model.MeetingRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    long countByExample(MeetingRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int deleteByExample(MeetingRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int insert(MeetingRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int insertSelective(MeetingRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    List<MeetingRoom> selectByExample(MeetingRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    MeetingRoom selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int updateByExampleSelective(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int updateByExample(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int updateByPrimaryKeySelective(MeetingRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Tue Nov 22 00:34:44 CST 2016
     */
    int updateByPrimaryKey(MeetingRoom record);
}