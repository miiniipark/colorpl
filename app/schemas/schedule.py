from pydantic import BaseModel
from typing import Optional
from datetime import datetime
from ..utils.enum import Category

class ScheduleActivity(BaseModel):
    schedule_id: int
    nickname: Optional[str] = None
    email: Optional[str] = None
    dtype: Optional[str] = None
    schedule_date_time: Optional[datetime] = None
    schedule_name: Optional[str] = None
    schedule_category: Optional[Category] = None
    review_written: bool
    is_reserved: bool

    class Config:
        from_attributes = True

class ScheduleDetail(BaseModel):
    schedule_id: int
    nickname: Optional[str] = None
    email: Optional[str] = None
    dtype: Optional[str] = None
    schedule_date_time: Optional[datetime] = None
    schedule_name: Optional[str] = None
    schedule_category: Optional[Category] = None
    schedule_latitude: Optional[float] = None
    schedule_longitude: Optional[float] = None
    schedule_location: Optional[str] = None
    schedule_seat: Optional[str] = None
    schedule_image: Optional[str] = None
    review_written: bool
    is_reserved: bool

    class Config:
        from_attributes = True

class ScheduleCreate(BaseModel):
    schedule_name: str
    schedule_date_time: datetime
    schedule_category: Category
    schedule_seat: str
    schedule_image: Optional[str]
    schedule_latitude: Optional[float] = None
    schedule_longitude: Optional[float] = None
    schedule_location: Optional[str] = None
    member_id: int
    reserve_detail_id: Optional[int] = None

class ScheduleUpdateDTO(BaseModel):
    schedule_name: Optional[str] = None
    schedule_date_time: Optional[datetime] = None
    schedule_category: Optional[Category] = None
    schedule_seat: Optional[str] = None
    schedule_latitude: Optional[float] = None
    schedule_longitude: Optional[float] = None
    schedule_location: Optional[str] = None
    schedule_image: Optional[str] = None

    class Config:
        from_attributes = True

class ScheduleSearch(BaseModel):
    nickname: Optional[str] = None
    email: Optional[str] = None
    schedule_name: Optional[str] = None
    schedule_category: Optional[Category] = None
    review_written: Optional[bool] = None 
    is_reserved: Optional[bool] = None